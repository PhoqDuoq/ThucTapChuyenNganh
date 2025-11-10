
function togglePassword() {
    const passwordInput = document.getElementById('password');
    const toggleIcon = document.querySelector('.password-toggle');

    if (passwordInput.type === 'password') {
        passwordInput.type = 'text';
        toggleIcon.textContent = '🙈'; // Thay bằng icon/class của bạn nếu muốn
    } else {
        passwordInput.type = 'password';
        toggleIcon.textContent = '👁️'; // Thay bằng icon/class của bạn nếu muốn
    }
}




window.addEventListener('load', function() {
    console.log('🔐 Đăng nhập Spring Security:');
    console.log('Username: user');
    console.log('Password: (Kiểm tra Console của Spring Boot để thấy mật khẩu được tạo tự động)');
});