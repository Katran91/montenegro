$(document).ready(function () {
    counter_par = 1;
    counter_stat = 1;
    counter_stud = 1;
    $("#add_participant").click(
        function(){
            counter_par += 1;

            var participant = $("#com_participant").clone();
            participant.attr("id", participant.attr("id") + counter_par);
            participant.attr("name", participant.attr("name") + counter_par);
            $("#participants").append(participant);
        }
    );

    $("#add_stat").click(
        function(){
            counter_stat += 1;

            var stat = $("#stat_row").clone();
            stat.children("label").text(counter_stat);
            $("#stats").append(stat);
        }
    );

    $("#add_student").click(
        function(){
            counter_stat += 1;

            var stat = $("#stat_row").clone();
            stat.children("label").text(counter_stat);
            $("#stats").append(stat);
        }
    );

    $('#date_picker').datetimepicker({
        language:  'en',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        forceParse: 0
    });
});