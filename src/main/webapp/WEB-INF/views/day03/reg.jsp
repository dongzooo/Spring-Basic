<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    *{
        box-sizing: border-box;
        background-color: lightgray;
    }
    table{
        margin: auto;
        width: 450px;
        height: 700px;
    }
    .input-text{
        background-color: white;
        /* width: 100%; */
        /* height: 100%; */
        margin: 0.3rem 0;
        padding: 0.5rem;;
    }
    input:not([type="radio"]){
    all: unset;
    font-size: 0.8rem;
    width: 100%;
    }
    
    a{
        font-size: small;
        font-weight: bold;
    }
    
    button{
        border: 2px solid rgba(0, 0, 0, 0.658);
        color:  black;
        font-weight: bold;
        font-size: 1.1rem;
        border-radius: 1.1rem;
        padding: 10px 180px;
        margin: auto;
        display: block;
}

button:hover{
    color: #fff;
    background-color: gray;
}
img{
    width: 20%;
    display: block;
    margin: auto;    
}
</style>
<body>
<form action="/day03/dto">
 <header><img src="/mySpring/src/main/webapp/WEB-INF/views/day03/Google_2015_logo.svg.png" alt="logo"></header>
    <table >
        <tr>
            <td>
                <a>아이디</a> <br>
                 <div class="input-text"><input type="text" name="id" autofocus placeholder="ID를 입력하세요">
                </div></td>
        </tr>

        <tr>
            <td>
                <a>비밀번호 </a> <br><div class="input-text"><input type="password" name="pw1" autofocus placeholder="비밀번호를 입력하세요" ></div></td>
        </tr>
        <tr>
            <td>
                <a>비밀번호 확인 </a> <br> <div class="input-text"><input type="password" name="pw" autofocus placeholder="비밀번호를 한번 더입력하세요" ></div></td>
        </tr>

        <tr>
            <td>
                <a>이름</a> <br> <div class="input-text"><input type="text" name="name" autofocus placeholder="이름을 입력하세요"></div></td>
        </tr>

        <tr>
            <td><a>성별</a> <br>
                <div class="input-text">
                남<input type="radio" name="sex" value="male" autofocus>
                여<input type="radio" name="sex" value="female" autofocus>
            </div>
            
            </td>
        </tr>

        <tr>
            <td>
                <a>본인 확인 이메일</a> <br>
                 <div class="input-text"><input type="text" name="email" autofocus placeholder="선택입력"></div>
            </td>
        </tr>

        <tr>
            <td>
                <a >전화번호</a> <br>
                <div class="input-text"><input type="text" name="phone" autofocus placeholder="010-xxxx-xxxx"></div>
            </td>
        </tr>
 
        


    </table>
        <button type="submit" onclick=register();><input type="submit" >가입하기</button>
       <!--  <button type="submit" onclick=register();>가입하기</button>--> 

        <script>
            function register(){
                alert("가입이 완료되었습니다.");
            }   
            // console.log(document.getElementsByClassName("input-text"));
    //   console.log(document.getElementById("input-text"));
    //   console.log(document.getElementsByName("input-text"));

    //   console.log(document.querySelector("div"))
      console.log(document.querySelectorAll("div"))
        </script>

</form>

</body>
</html>