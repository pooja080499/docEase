/**
 * 
 */


function toggleForm() {
    const role = document.getElementById("role").value;
    const patientForm = document.getElementById("patientForm");
    const doctorForm = document.getElementById("doctorForm");

    if (role === "patient") {
        patientForm.style.display = "block";
        doctorForm.style.display = "none";
    } else if (role === "doctor") {
        doctorForm.style.display = "block";
        patientForm.style.display = "none";
    } else {
        patientForm.style.display = "none";
        doctorForm.style.display = "none";
    }
}
