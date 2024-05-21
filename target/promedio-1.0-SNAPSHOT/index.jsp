<jsp:include page="partials/header.jsp" />

<div class="container py-5">
    <div class="card">
        <div class="card-header">
            <h1>Calculadora de Promedio de estudiante</h1>
        </div>
        <div class="card-body">
            <c:if test="${not empty requestScope.error}">
                    ${requestScope.error}
            </c:if>
            <form action="Promedio" method="post">
                <label for="fullname">Nombre completo:</label><br>
                <input class="form-control" type="text" id="fullname" name="fullname" value="${requestScope.fullname}" required><br>
                <label for="note1">Primera Nota:</label><br>
                <input class="form-control" type="text" id="note1" name="note1" value="${requestScope.note1}" required><br>
                <label for="note2">Segunda Nota:</label><br>
                <input class="form-control" type="text" id="note2" name="note2" value="${requestScope.note2}" required><br>
                <label for="note3">Tercera Nota:</label><br>
                <input class="form-control" type="text" id="note3" name="note3" value="${requestScope.note3}" required><br>
                <input class="btn btn-outline-success" type="submit" value="Calcular">
            </form>
        </div>
    </div>
</div>

<jsp:include page="partials/footer.jsp" />
