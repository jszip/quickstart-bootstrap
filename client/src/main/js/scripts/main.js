var postRequest = new XMLHttpRequest();
postRequest.onreadystatechange = function () {
    if (postRequest.readyState == 4) {
        if (postRequest.status == 200) {
            document.getElementById("result").textContent = postRequest.responseText;
        } else {
            document.getElementById("result").textContent = "An error has occurred";
        }
    }
};
postRequest.open("POST", "api/greeter", true);
postRequest.setRequestHeader("Content-type", "application/json");
postRequest.send('["Sally","Harry","Fred"]');