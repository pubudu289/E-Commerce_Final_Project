/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$("#Register").click(function (evt) {
    evt.preventDefault();
    const  first_name = document.getElementById("first_name");
    const  last_name = document.getElementById("last_name");
    const txt_email = document.getElementById("txt_email");
    const pass = document.getElementById("newpassword");
    const compass = document.getElementById("comfirmpassword");

    const form = document.getElementById("form");
    const  name_error_first = document.getElementById("name_error_first");
    const  name_error_last = document.getElementById("name_error_last");
    const  name_error_email = document.getElementById("name_error_email");
    const  name_error_pass = document.getElementById("name_error_pass");
    const  name_error_compass = document.getElementById("name_error_compass");

    var check_email = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;



    if (first_name.value === '' || first_name.value == null) {
        name_error_first.innerHTML = "*First name is required";
    } else {
        var fname = first_name.value;
        name_error_first.innerHTML = "";

    }

    if (last_name.value === '' || last_name.value == null) {
        name_error_last.innerHTML = "*Last name is required";
    } else {
        var lname = last_name.value;
        name_error_last.innerHTML = "";
    }

    if (!txt_email.value.match(check_email)) {
        name_error_email.innerHTML = "*Valied Email is required";
    } else {
        var temail = txt_email.value;
        name_error_email.innerHTML = "";

    }

    if (pass.value === '' || pass.value == null) {
        name_error_pass.innerHTML = "*Password is required";
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

    var check = document.getElementById("truecheckbox");
    const error_check_alert = document.getElementById("name_error_checkbox");

    if (!check.checked) {
        error_check_alert.innerHTML = "If you agreed the terms of service,\n\
 Please clicking the checkbox..! ";
        error_check_alert.style.color = "red";
    } else {
        error_check_alert.innerHTML = " ";
    }

    if (fname && lname && temail && comp && check.checked) {

        $('#staticBackdrop1').modal('show');

        $.ajax({
            type: 'POST',
            url: "/Ecom_final_project/RegisterUser",
            data: {"first_name": fname, "last_name": lname, "txt_email": temail, "pass": comp},
            success: function (data) {
                $('#staticBackdrop1').modal('hide');
                if (data === "00") {

                    document.forms['form'].reset();
                    updateValue();
                    name_error_pass.innerHTML = "";
                    name_error_pass.style.color = "red";
                    name_error_compass.style.color = "red";
                    window.location = "/Ecom_final_project/customer/mailVerifySuccess.jsp";

                } else if (data === "01") {
                    window.location = "/Ecom_final_project/customer/signup.jsp";


                } else if (data === "03") {
                    $('#staticBackdrop1').modal('hide');
                    $('#exampleModalToggle1').modal('show');
                    document.forms['form'].reset();
                    updateValue();
                    name_error_pass.innerHTML = "";
                    name_error_pass.style.color = "red";
                    name_error_compass.style.color = "red";

                }
            },
            error: function () {
                alert('error');
            }
        });

    }

});



const  first_name = document.getElementById("first_name");
const  name_error_first = document.getElementById("name_error_first");

first_name.addEventListener("input", updateFirstname);
function updateFirstname(e) {
    if (first_name.value.length === 0) {
        name_error_first.innerHTML = "*First name is required";
        name_error_compass.style.color = "red";
        return;
    } else {
        name_error_first.innerHTML = "";
    }
}

const  last_name = document.getElementById("last_name");
const  name_error_last = document.getElementById("name_error_last");
last_name.addEventListener("input", updateLastName);
function updateLastName(e) {
    if (last_name.value.length === 0) {
        name_error_last.innerHTML = "*Last name is required";
        name_error_compass.style.color = "red";
        return;
    } else {
        name_error_last.innerHTML = "";
    }
}

const txt_email = document.getElementById("txt_email");
const  name_error_email = document.getElementById("name_error_email");

txt_email.addEventListener("input", updateEmail);
function updateEmail(e) {
    var check_email = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if (!txt_email.value.match(check_email)) {
        name_error_email.innerHTML = "*Valied Email is required";
    } else {
        name_error_email.innerHTML = "";
    }
}


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


