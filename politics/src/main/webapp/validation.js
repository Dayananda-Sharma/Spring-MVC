function validation(){
let leader=document.getElementById("1").value.trim();


if(leader=== "" || leader.length>=5){
    alert("User name invalid")
    return false;
}
   return true;
}