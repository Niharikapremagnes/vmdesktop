    function valid(){
        var n = document.getElementById('name').value;
        var ag = document.getElementById('age').value;
        var gen = document.getElementById('gender').value;
        var pass = document.getElementById('create').value;
    if(n == " "){
        document.getElementById('name_err').innerHTML="**Please write Name in the box**";
    return false;
    }
        else if(n.length<5 && n.length>20){
        document.getElementById('name_err').innerHTML="Please write atleast 5 characters and atmost 20 characters in the box";
        return false;

        }
        else if(!isNaN(n)){
        document.getElementById('name_err').innerHTML="**Please type Alphabet only in the box**";
        return false;

        }else{
        document.getElementById('name_err').innerHTML="";
        }

    if(ag == " "){
        document.getElementById('age_err').innerHTML="**Please write Age**";
        return false;
    }
    else if(isNan(ag)){
        document.getElementById('age_err').innerHTML="**Please write Numeric only in the box**";
    }
    else{
        document.getElementById('age_err').innerHTML="";
        }

if(gen.checked == ""){
        document.getElementById('gender-err').innerHTML="**Select a Gender**";
        return false;
    }else{
        document.getElementById('gender-err').innerHTML="";
    }

   if(pass == ""){
        document.getElementById('create_err').innerHTML="**Please write a password in the box**";
        return false;
    }
    else if(pass.length<8){
        document.getElementById('create_err').innerHTML="**Please type minimum 8 character password in the box**";
        return false;

    }
    else{
        document.getElementById('create_err').innerHTML="";
    }