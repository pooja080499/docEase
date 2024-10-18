/**
 * 
 */

function toggleLoginForm() {
    const role = document.getElementById("role").value;
    const userLoginForm = document.getElementById("userLoginForm");
    const doctorLoginForm = document.getElementById("doctorLoginForm");

    if (role === "user") {
        userLoginForm.style.display = "block";
        doctorLoginForm.style.display = "none";
    } else if (role === "doctor") {
        doctorLoginForm.style.display = "block";
        userLoginForm.style.display = "none";
    } else {
        userLoginForm.style.display = "none";
        doctorLoginForm.style.display = "none";
    }
}
