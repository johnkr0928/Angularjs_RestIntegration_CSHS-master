var express = require('express');
var app = express();
app.use(express.static(__dirname + '/public'));

var port = 9009;

app.listen(port);
console.log('server on '+port);