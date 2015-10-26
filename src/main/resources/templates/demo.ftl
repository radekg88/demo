<html>

<head>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/dt/jqc-1.11.3,dt-1.10.9/datatables.min.css"/>

    <script type="text/javascript" src="https://cdn.datatables.net/r/dt/jqc-1.11.3,dt-1.10.9/datatables.min.js"></script>

    <script>
        $(document).ready(function (){
            var table = $('#example').DataTable({
                ajax: {
                    url: 'http://localhost:8080/demoes',
                    dataSrc: '_embedded.demoes'
                },
                columns: [
                    { data: "name" },
                    { data: "value" }
                ]
            });
        });

    </script>

</head>
<body>

<table id="example" class="display" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>Name</th>
        <th>Value</th>
    </tr>
    </thead>
    <tfoot>
    <tr>
        <th>Name</th>
        <th>Value</th>
    </tr>
    </tfoot>
</table>



</body>

</html>