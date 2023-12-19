/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("#btnpwUpdate").click(function () {


        const pass = document.getElementById("newpassword");
        const compass = document.getElementById("comfirmpassword");

        const  name_error_pass = document.getElementById("name_error_pass");
        const  name_error_compass = document.getElementById("name_error_compass");


        if (pass.value === '' || pass.value == null) {
            name_error_pass.innerHTML = "*Password is required";
            name_error_pass.style.color = "red";
        } else {
            name_error_pass.innerHTML = "";
        }

        if (compass.value === '' || compass.value == null) {
            name_error_compass.innerHTML = "*Conmfirm Password is required";
        } else {
            name_error_compass.innerHTML = "";
        }
        if (pass.value === compass.value) {
            var comp = compass.value;
        }

    });
});



const compass = document.getElementById("comfirmpassword");
const  name_error_compass = document.getElementById("name_error_compass");

compass.addEventListener("input", compairPassword);
function compairPassword(e) {
    if (compass.value.length === 0) {
        name_error_compass.innerHTML = "*Comfirm Passward Required";
        name_error_compass.style.color = "red";
        return;
    }

    if (pass.value === compass.value) {
        name_error_compass.innerHTML = "Password is Matched";
        name_error_compass.style.color = "green";
    } else {
        name_error_compass.innerHTML = "Password is Not Matched";
        name_error_compass.style.color = "red";
    }

}

const pass = document.getElementById("newpassword");
const  name_error_pass = document.getElementById("name_error_pass");

const  chareight = document.getElementById("chareight");
const  lownum = document.getElementById("lownum");
const  upper = document.getElementById("upper");
const  spec = document.getElementById("spec");
const  number = document.getElementById("num");

pass.addEventListener("input", updateValue);
function updateValue(e) {

    // Create an array and push all possible values that you want in password

    var matchedCase = new Array();
    matchedCase.push("[$@$!%*#?&]"); // Special Charector
    matchedCase.push("[A-Z]"); // Uppercase Alpabates
    matchedCase.push("[0-9]"); // Numbers
    matchedCase.push("[a-z]"); // Lowercase Alphabates

    // Check the conditions
    var ctr = 0;
    for (var i = 0; i < matchedCase.length; i++) {
        if (new RegExp(matchedCase[i]).test(pass.value)) {
            ctr++;
        }

    }
    if (pass.value.length < 7) {
        name_error_pass.innerHTML = "Add minimum 8 Characters";
    } else {
        name_error_pass.innerHTML = "Add minimum 8 Characters";
        name_error_pass.style.color = "red";
    }

    var uppercase = /[$@$!%*#?&]/;
    var uc = pass.value.match(uppercase);
    if (uc) {
        colorSpec = "green";
        spec.style.color = colorSpec;
    } else {
        colorSpec = "gray";
        spec.style.color = colorSpec;

    }

    var specialChar = /[A-Z]/;
    var sc = pass.value.match(specialChar);
    if (sc) {
        colorUppr = "green";
        upper.style.color = colorUppr;
    } else {
        colorUppr = "gray";
        upper.style.color = colorUppr;
    }

    var numb = /[0-9]/;
    var nb = pass.value.match(numb);
    if (nb) {
        colorNumb = "green";
        number.style.color = colorNumb;
    } else {
        colorNumb = "gray";
        number.style.color = colorNumb;
    }

    var lawer = /[a-z]/;
    var lc = pass.value.match(lawer);
    if (lc) {
        colorLawer = "green";
        lownum.style.color = colorLawer;
    } else {
        colorLawer = "gray";
        lownum.style.color = colorLawer;
    }

    if (pass.value.length >= 8) {
        console.log(pass.value.length);
        chareight.style.color = "green";


        // Display it
        var color = "";
        var colorUppr = "";
        var colorLawer = "";
        var colorSpec = "";
        var colorNumb = "";
        var strength = "";
        console.log(pass.value);

        switch (ctr) {
            case 0:
            case 1:
                strength = "Add number and lawercase";
                color = "red";
                break;
            case 2:
                strength = "Add Upper case";
                color = "red";
                break;
            case 3:
                strength = "Special character";
                color = "red";
                break;
            case 4:
                strength = "Good Passward";
                color = "green";
                break;
        }
        name_error_pass.innerHTML = strength;
        name_error_pass.style.color = color;
    } else {
        chareight.style.color = "gray";
    }
}


