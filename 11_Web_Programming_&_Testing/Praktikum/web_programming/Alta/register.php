<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Web Testing</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
    <div class="container mt-4 mb-4 border">
        <h1 class="text-center">Welcome to Digital Library</h1>
        <p class="text-center">Create a new member</p>
        <form action="">
            <div class="pb-2">
                <label for="name" class="mb-2">Name</label>
                <input type="text" class="form-control">
            </div>
            <div>
                <label for="email">Email</label>
                <input type="email" class="form-control">
            </div>
            <br>
            <div>
                <label for="password">Password</label>
                <input type="password" class="form-control">
            </div>
            <br>
            <div>
                <label for="phone">Phone Number</label>
                <input type="phone" class="form-control">
            </div>
            <br>
            <div>
                <label for="Address">Address</label>
                <textarea name="" id="" cols="30" rows="10" class="form-control"></textarea>
            </div>
            <br>
            <div>
                <label for="Gender">Gender</label>
                <input type="radio" name="gender">Male</input>
                <input type="radio" name="gender">Female</input>
            </div>
            <br>
            <div class="d-grid gap-2">
                <button type="submit" name="register" class="btn btn-primary full mb-4">Submit</button>
            </div>
        </form>
    </div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
</script>

</html>