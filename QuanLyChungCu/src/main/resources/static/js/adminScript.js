// Show/Hide Sections
function showSection(sectionName) {
    // Hide all sections
    const sections = document.querySelectorAll('.section');
    sections.forEach(section => {
        section.classList.remove('active');
    });

    // Show selected section
    document.getElementById(sectionName).classList.add('active');

    // Update active menu item
    const menuItems = document.querySelectorAll('.menu-item');
    menuItems.forEach(item => {
        item.classList.remove('active');
    });
    event.target.classList.add('active');
}

// Modal Functions
function openModal(modalId) {
    document.getElementById(modalId).classList.add('active');
}

function closeModal(modalId) {
    document.getElementById(modalId).classList.remove('active');
}

// Close modal when clicking outside
window.onclick = function(event) {
    if (event.target.classList.contains('modal')) {
        event.target.classList.remove('active');
    }
}

// Search functionality for residents
const residentSearchInput = document.getElementById('residentSearch');
if (residentSearchInput) {
    residentSearchInput.addEventListener('input', function(e) {
        const searchTerm = e.target.value.toLowerCase();
        const table = document.getElementById('residentsTable');
        const rows = table.getElementsByTagName('tbody')[0].getElementsByTagName('tr');

        Array.from(rows).forEach(row => {
            const text = row.textContent.toLowerCase();
            row.style.display = text.includes(searchTerm) ? '' : 'none';
        });
    });
}

// Form submit handlers
const forms = document.querySelectorAll('form');
forms.forEach(form => {
    form.addEventListener('submit', function(e) {
        e.preventDefault();
        showNotification('Đã lưu thành công!', 'success');
        
        // Close the modal
        const modal = this.closest('.modal');
        if (modal) {
            modal.classList.remove('active');
        }
        
        // Reset form
        this.reset();
    });
});

// Delete button handlers
document.addEventListener('click', function(e) {
    if (e.target.classList.contains('btn-danger') && e.target.textContent.includes('Xóa')) {
        if (confirm('Bạn có chắc chắn muốn xóa?')) {
            const row = e.target.closest('tr');
            if (row) {
                row.style.opacity = '0';
                row.style.transition = 'opacity 0.3s';
                setTimeout(() => row.remove(), 300);
            }
            showNotification('Đã xóa thành công!', 'success');
        }
    }
});

// Edit button handlers
document.addEventListener('click', function(e) {
    if (e.target.classList.contains('btn-success') && e.target.textContent.includes('Sửa')) {
        showNotification('Chức năng chỉnh sửa đang được phát triển!', 'info');
    }
});

// Remind payment button
document.addEventListener('click', function(e) {
    if (e.target.classList.contains('btn-warning') && e.target.textContent.includes('Nhắc nhở')) {
        showNotification('Đã gửi thông báo nhắc nhở thanh toán!', 'success');
    }
});

// Complete maintenance button
document.addEventListener('click', function(e) {
    if (e.target.textContent.includes('✅ Hoàn thành')) {
        if (confirm('Xác nhận hoàn thành yêu cầu bảo trì?')) {
            const row = e.target.closest('tr');
            const statusCell = row.querySelector('.badge-warning');
            if (statusCell) {
                statusCell.className = 'badge badge-success';
                statusCell.textContent = 'Hoàn thành';
            }
            e.target.style.display = 'none';
            showNotification('Đã hoàn thành yêu cầu bảo trì!', 'success');
        }
    }
});

// Animate stats on page load
window.addEventListener('load', function() {
    const statValues = document.querySelectorAll('.stat-card .value');
    statValues.forEach(stat => {
        stat.style.opacity = '0';
        setTimeout(() => {
            stat.style.transition = 'opacity 0.5s';
            stat.style.opacity = '1';
        }, 100);
    });
});

// Add hover effect to table rows
const tableRows = document.querySelectorAll('tbody tr');
tableRows.forEach(row => {
    row.addEventListener('mouseenter', function() {
        this.style.backgroundColor = '#f7fafc';
    });
    row.addEventListener('mouseleave', function() {
        this.style.backgroundColor = '';
    });
});

// Notification system
function showNotification(message, type = 'success') {
    const notification = document.createElement('div');
    notification.style.cssText = `
        position: fixed;
        top: 20px;
        right: 20px;
        padding: 15px 25px;
        background: ${type === 'success' ? '#48bb78' : type === 'info' ? '#4299e1' : '#f56565'};
        color: white;
        border-radius: 8px;
        box-shadow: 0 4px 6px rgba(0,0,0,0.2);
        z-index: 10000;
        animation: slideIn 0.3s ease;
        font-weight: 600;
    `;
    notification.textContent = message;
    document.body.appendChild(notification);

    setTimeout(() => {
        notification.style.animation = 'slideOut 0.3s ease';
        setTimeout(() => notification.remove(), 300);
    }, 3000);
}

// Initialize on page load
document.addEventListener('DOMContentLoaded', function() {
    console.log('Him Lam Admin System Loaded Successfully!');
    console.log('Version 1.0.0');
});