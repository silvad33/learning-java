/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



var a= 'vara,prasad';
var b = a.split(",");
var userlist = a.split(",");
var user = 'vara';
var noofusers = userlist.length ;
var i = 0;
var message;

for(i=0; i < noofusers; i++) {
		if(userlist[i] == user) {
			message = 'valid user';
}else {
			message = 'Not a valid user';
}
} 
 
