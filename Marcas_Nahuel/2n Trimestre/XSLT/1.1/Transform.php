<?php
// Load XML file
$xml = new DOMDocument;
$xml->load('Robert_Torrent_Nahuel_Ejercicio1.xml');

// Load XSL file
$xsl = new DOMDocument;
$xsl->load('Robert_Torrent_Nahuel_Ejercicio1.1.xsl');

// Configure the transformer
$proc = new XSLTProcessor;

// Attach the xsl rules
$proc->importStyleSheet($xsl);

echo $proc->transformToXML($xml);
?> 