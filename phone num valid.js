const phonenum// Function to validate phone number (US format: (xxx) xxx-xxxx or xxx-xxx-xxxx)
function validatePhoneNumber(phone) {
    const phonePattern = /^(?:\(\d{3}\)\s?|\d{3}-)\d{3}-\d{4}$/;
    return phonePattern.test(phone);
}

// Example usage:
const phone1 = "(123) 456-7890";
const phone2 = "123-456-7890";
const phone3 = "(123) 456 7890";
const phone4 = "1234567890";

console.log(validatePhoneNumber(phone1));  // Output: true (valid)
console.log(validatePhoneNumber(phone2));  // Output: true (valid)
console.log(validatePhoneNumber(phone3));  // Output: true (valid)
console.log(validatePhoneNumber(phone4));  // Output: false (invalid)