<jsp:include page="partials/header.jsp" />

<div class="container py-5">
    <div class="card">
        <div class="card-header">
            <h1>Calculadora de Promedio de estudiante</h1>
        </div>
        <div class="card-body">
            <form action="Promedio" method="post">
                <label for="fullname">Nombre completo:</label><br>
                <input class="form-control" type="text" id="fullname" name="fullname" value="${fullName}" required readonly><br>
                <label for="note1">Promedio:</label><br>
                <input class="form-control" type="text" id="note1" name="note1" value="${PromedioEstudiante}" required readonly><br>
                <label for="note2">Categoria:</label><br>
                <input class="form-control ${color}" type="text" id="note2" name="note2" value="${Categoria}" required readonly><br>
                <a class="btn btn-outline-dark" href="index.jsp">REGRESAR</a>
            </form>
        </div>
    </div>
</div>

<jsp:include page="partials/footer.jsp" />