/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var para = document.getElementById('ok');
var text = para.innerHTML;
para.innerHTML = "";
var words = text.split(" ");
for (i = 0; i < 7; i++) {
  para.innerHTML += words[i] + " ";
}
para.innerHTML += "...";