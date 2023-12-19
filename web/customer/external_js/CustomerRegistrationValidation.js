/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("#btnRegister").click(function () {

        const  email = document.getElementById("txtemail").value;
        const  fullname = document.getElementById("full_name").value;
        const  bday = document.getElementById("txtdob").value;

        var gender = $("input:radio[name=inlineRadioOptions]:checked").val();

        const  mobileNo = document.getElementById("txtmobile").value;
        const  country = document.getElementById("txtcountry").value;
        const  maincity = document.getElementById("maincity").value;
        const  homecity = document.getElementById("homecity").value;
        const  addlineone = document.getElementById("addlineone").value;
        const  addlinetwo = document.getElementById("addlinetwo").value;
        const  addlinethree = document.getElementById("addlinethree").value;
        const  postalcode = document.getElementById("txt_postal").value;

        const  name_error_fullname = document.getElementById("name_error_fullname");
        const  name_error_dob = document.getElementById("name_error_dob");
        const  name_error_mobile = document.getElementById("name_error_mobile");
        const  name_error_maincity = document.getElementById("name_error_maincity");
        const  name_error_homecity = document.getElementById("name_error_homecity");
        const  name_error_addlineone = document.getElementById("name_error_addlineone");
        const  name_error_addlinetwo = document.getElementById("name_error_addlinetwo");
        const  name_error_postal = document.getElementById("name_error_postal");

        if (fullname === '' || fullname == null) {
            name_error_fullname.innerHTML = "*Full name is required";
        } else {
            var fname = fullname;
            name_error_fullname.innerHTML = "";
        }

        if (bday === '' || bday == null) {
            name_error_dob.innerHTML = "*Date of Birth is required";
        } else {
            var birthday = bday;
            name_error_dob.innerHTML = "";
        }
        if (mobileNo === '' || mobileNo == null) {
            name_error_mobile.innerHTML = "*Mobile Number is required";
        } else {
            var mob = mobileNo;
            name_error_mobile.innerHTML = "";
        }
        if (maincity === '' || maincity == null) {
            name_error_maincity.innerHTML = "*Main city is required";
        } else {
            var mcity = maincity;
            name_error_maincity.innerHTML = "";
        }
        if (homecity === '' || homecity == null) {
            name_error_homecity.innerHTML = "*Home city is required";
        } else {
            var hcity = homecity;
            name_error_homecity.innerHTML = "";
        }
        if (addlineone === '' || addlineone == null) {
            name_error_addlineone.innerHTML = "*Address line 1 is required";
        } else {
            var addline1 = addlineone;
            name_error_addlineone.innerHTML = "";
        }
        if (addlinetwo === '' || addlinetwo == null) {
            name_error_addlinetwo.innerHTML = "*Address line 2 is required";
        } else {
            var addline2 = addlinetwo;
            name_error_addlinetwo.innerHTML = "";
        }
        if (postalcode === '' || postalcode == null) {
            name_error_postal.innerHTML = "*Postal Code is required";
        } else {
            var pcode = postalcode;
            name_error_postal.innerHTML = "";
        }

        if (email && fname && birthday && mob && mcity && hcity && addline1 && addline2 && pcode) {


            $.ajax({
                type: 'POST',
                url: "/Ecom_final_project/AddUserDetails",
                data: {"email": email, "fullname": fullname, "bday": bday,
                    "gender": gender, "mobileNo": mobileNo, "country": country,
                    "maincity": maincity, "homecity": homecity, "addlineone": addlineone,
                    "addlinetwo": addlinetwo, "addlinethree": addlinethree,
                    "postalcode": postalcode},
                success: function (data) {

                    if (data === "00") {
                        window.location.replace("/Ecom_final_project/customer/signin.jsp");
                    } else {
                        window.location.replace("/Ecom_final_project/customer/userRegister.jsp?=" + email);
                    }
                },
                error: function () {

                }
            });
        }




    });
});

const  fullname = document.getElementById("full_name");
const  bday = document.getElementById("txtdob");
const  mobileNo = document.getElementById("txtmobile");
const  country = document.getElementById("txtcountry");
const  maincity = document.getElementById("maincity");
const  homecity = document.getElementById("homecity");
const  addlineone = document.getElementById("addlineone");
const  addlinetwo = document.getElementById("addlinetwo");
const  postalcode = document.getElementById("txt_postal");

const  name_error_fullname = document.getElementById("name_error_fullname");
const  name_error_dob = document.getElementById("name_error_dob");
const  name_error_mobile = document.getElementById("name_error_mobile");
const  name_error_maincity = document.getElementById("name_error_maincity");
const  name_error_homecity = document.getElementById("name_error_homecity");
const  name_error_addlineone = document.getElementById("name_error_addlineone");
const  name_error_addlinetwo = document.getElementById("name_error_addlinetwo");
const  name_error_postal = document.getElementById("name_error_postal");

fullname.addEventListener("input", updateFullname);
function updateFullname(e) {
    if (fullname.value.length === 0) {
        name_error_fullname.innerHTML = "*Full name is required";
        name_error_fullname.style.color = "red";
        return;
    } else {
        name_error_fullname.innerHTML = "";
    }
}

bday.addEventListener("input", updateBday);
function updateBday(e) {
    if (bday.value.length === 0) {
        name_error_dob.innerHTML = "*Date of Birth is required";
        name_error_dob.style.color = "red";
        return;
    } else {
        name_error_dob.innerHTML = "";
    }
}


mobileNo.addEventListener("input", updateMobile);
function updateMobile(e) {
    if (mobileNo.value.length === 0) {
        name_error_mobile.innerHTML = "*Mobile Number is required";
        name_error_mobile.style.color = "red";
        return;
    } else {
        name_error_mobile.innerHTML = "";
    }
}

maincity.addEventListener("input", updateMaincity);
function updateMaincity(e) {
    if (maincity.value.length === 0) {
        name_error_maincity.innerHTML = "*Main city is required";
        name_error_maincity.style.color = "red";
        return;
    } else {
        name_error_maincity.innerHTML = "";
    }
}


homecity.addEventListener("input", updateHomecity);
function updateHomecity(e) {
    if (homecity.value.length === 0) {
        name_error_homecity.innerHTML = "*Home city is required";
        name_error_homecity.style.color = "red";
        return;
    } else {
        name_error_homecity.innerHTML = "";
    }
}


addlineone.addEventListener("input", updateAddlineone);
function updateAddlineone(e) {
    if (addlineone.value.length === 0) {
        name_error_addlineone.innerHTML = "*Address line 1 is required";
        name_error_addlineone.style.color = "red";
        return;
    } else {
        name_error_addlineone.innerHTML = "";
    }
}


addlinetwo.addEventListener("input", updateAddlinetwo);
function updateAddlinetwo(e) {
    if (addlinetwo.value.length === 0) {
        name_error_addlinetwo.innerHTML = "*Address line 2 is required";
        name_error_addlinetwo.style.color = "red";
        return;
    } else {
        name_error_addlinetwo.innerHTML = "";
    }
}


postalcode.addEventListener("input", updatePostalcode);
function updatePostalcode(e) {
    if (postalcode.value.length === 0) {
        name_error_postal.innerHTML = "*Postal Code is required";
        name_error_postal.style.color = "red";
        return;
    } else {
        name_error_postal.innerHTML = "";
    }
}