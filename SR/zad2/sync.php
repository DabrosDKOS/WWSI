<?php 
    error_reporting(E_ALL);
    ini_set('display_errors', 1);
    include_once 'backend.php';
    $db = new DB();

    $cronMinute = 15;
    $limit = floor(45 / (60 / $cronMinute)); //45 emailu to max jaki możemy wysłać wciągu godziny aby nie wtrafić do spamu 

    $mails = $db->getArray('SELECT email_queue_id, email_queue_title, email_queue_text, email_queue_to_email FROM `email_queue` WHERE email_queue_is_send = 0 LIMIT ' . $limit);

    if(!empty($mails)) {
        $isSendArray = [];
        foreach ($mails as $mail) {
            if(mail($mail['email_queue_to_email'], $mail['email_queue_title'], $mail['email_queue_text'])){
                $isSendArray[] = $mail['email_queue_id'];
            };
        }

        $db->update("UPDATE `email_queue` SET `email_queue_is_send` = '1' WHERE `email_queue_id` IN ( " . implode(',', $isSendArray) . " )");
    }

    echo('cron okey');
    die();
?>
