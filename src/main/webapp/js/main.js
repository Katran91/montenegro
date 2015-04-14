$(document).ready(function () {
    counter_par = 1;
    counter_stat = 1;
    $("#add_participant").click(
        function(){
            counter_par += 1;

            var participant = $("#com_participant").clone();
            participant.attr("id", participant.attr("id") + counter_par);
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
});