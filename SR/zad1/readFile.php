<?php

class readFile
{
    public $filePath = null;

    public function readXML() {
        $xml = simplexml_load_file($this->filePath) or die("Error: Cannot create object");
        return $xml;
    }

    public function getArray() {
        $output = $this->readXML();
        return $this->objectToArray($output);
    }

    public function objectToArray($data) {
        //var_dump($data); die();
        if(is_object($data)) {
            foreach ((array)$data as $key => $value) {
                return (array)$this->objectToArray($value);
            }
        }

        return (array)$data;
    }
}
