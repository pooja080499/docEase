/**
 * 
 */

// Static data for doctors
const doctors = [
    { name: "Dr. Smith", specialization: "Cardiologist" },
    { name: "Dr. Johnson", specialization: "Dentist" },
    { name: "Dr. Lee", specialization: "Dermatologist" }
];

// Function to populate doctor list based on specialization
document.getElementById('specialization').addEventListener('change', function() {
    const specialization = this.value;
    const doctorList = document.querySelector('#doctor-list tbody');
    doctorList.innerHTML = ''; // Clear previous rows

    const filteredDoctors = doctors.filter(doctor => doctor.specialization === specialization);
    filteredDoctors.forEach(doctor => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${doctor.name}</td>
            <td>${doctor.specialization}</td>
            <td><button onclick="bookAppointment('${doctor.name}')">Book</button></td>
        `;
        doctorList.appendChild(row);
    });
});

// Function to book appointment
function bookAppointment(doctorName) {
    alert(`Appointment booked with ${doctorName}`);
}

// Function to start chat
function startChat() {
    alert('Chat started!');
}
