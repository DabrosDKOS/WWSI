<?php 
    error_reporting(E_ALL);
    ini_set('display_errors', 1);
    include_once 'backend.php';
    include_once 'readFile.php';

    $db = new DB(); 
    $persons = $db->getArray('SELECT * FROM `persons`');

    $readFile = new readFile();
    $readFile->filePath = './data.xml';
    $xmlData = $readFile->getArray();

    $foreachData = array_merge($persons, $xmlData);
?>

<table>
<?php
    foreach ($foreachData as $key => $value) {
        $echoData = (array)$value;
?>
        <tr>
            <td><?php echo $echoData['id']; ?></td>
            <td><?php echo $echoData['name']; ?></td>
            <td><?php echo $echoData['years']; ?></td>
            <td><?php echo $echoData['description']; ?></td>
        </tr>
<?php
    }
?>
</table>