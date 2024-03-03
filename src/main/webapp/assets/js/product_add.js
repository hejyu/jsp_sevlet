/**
 * 회원 정보 입력을 확인하기 위한 스크립트입니다
 */
document.getElementById('btn_add').addEventListener('click', function() {
    if(fn_form_valid()) {
        document.forms[0].submit()
    }
})


const fn_form_valid = function() {
    let m_p_code = document.getElementById('p_code').value.trim()
    let m_category = document.getElementById('category').value.trim()
    let m_p_name = document.getElementById('p_name').value.trim()
    let m_price = document.getElementById('price').value.trim()

    if(m_p_code === "") {
        alert("상품코드를 입력해주세요")
        document.getElementById('custom_id').focus()
        return false
    }

    if( m_category === "") {
        alert("카테고리를 입력해주세요")
        document.getElementById('category').focus()
        return false
    }

    if( m_p_name === "") {
        alert("상품이름을 입력해주세요")
        document.getElementById('p_name').focus()
        return false
    }

    if( m_price === "") {
        alert("가격을 입력해주세요")
        document.getElementById('price').focus()
        return false
    }


    return true

}
