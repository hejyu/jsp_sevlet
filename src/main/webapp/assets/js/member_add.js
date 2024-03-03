/**
 * 회원 정보 입력을 확인하기 위한 스크립트입니다
 */
document.getElementById('btn_add').addEventListener('click', function() {
    if(fn_form_valid()) {
        document.forms[0].submit()
    }
})


const fn_form_valid = function() {
    let m_mem_id = document.getElementById('custom_id').value.trim()
    let m_mem_name = document.getElementById('name').value.trim()
    let m_mem_contact = document.getElementById('email').value.trim()
    let m_age = document.getElementById('age').value.trim()
    
    if(m_mem_id === "") {
        alert("아이디를 입력해주세요")
        document.getElementById('custom_id').focus()
        return false       
    }


    if( m_mem_name === "") {
        alert("이름을 입력해주세요")
        document.getElementById('name').focus()
        return false
    }

    let regex = /^[ㄱ-ㅎ|가-힣a-zA-Z]+$/
    if(!regex.test(m_mem_name)) {
        alert("이름은 한글과 영문만 입력할 수 있습니다")
        document.getElementById('name').focus()
        return false
    }

    regix = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/
    if(m_mem_contact !== "" && !regix.test(m_mem_contact)) {
        alert("이메일은 유효한 형식으로 입력해주세요")
        document.getElementById('email').focus()
        console.log(m_mem_contact)
        return false
    }


    return true

}
