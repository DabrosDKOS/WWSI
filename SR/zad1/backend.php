<!-- CREATE TABLE `marcin_dabrowski_db1`.`persons` ( `id` INT NOT NULL AUTO_INCREMENT , `name` VARCHAR(128) NOT NULL , `years` VARCHAR(3) NOT NULL , `description` TEXT NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB; -->

<?php

class DB
    {
        private $servername = "localhost";
        private $username = "root";
        private $password = "qaz123";
        private $databases = "marcin_dabrowski_db1";

        private $db = null;

        private function db_init() {
            if(!$this->db){
                try {
                        $this->db = new PDO("mysql:host=$this->servername;dbname=$this->databases", $this->username, $this->password);
                        $this->db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                    }
                catch(PDOException $e)
                    {
                        echo "Nie masz kontaktu z bazą danych MYSQL: " . $e->getMessage();
                        $this->db = null;
                    }
            }

            return $this->db;
        }

        function __construct() {
            $this->db_init();
        }

        private function returnQueryData($sql) {
            $sqlAction = $this->db->prepare($sql);
            $sqlAction->execute();
            $sqlAction->setFetchMode(PDO::FETCH_ASSOC); 

            return $sqlAction;
        }

        function getArray($sql) {
            return $this->returnQueryData($sql)->fetchAll();
        }
        
        
    }
    
?>

