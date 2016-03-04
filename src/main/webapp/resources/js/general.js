$(document).on('ready', function() {
    /* ======================================================
     Listas internas
     ========================================================*/
    $('.sidebar-menu > li > ul').each(function() {
        $(this).attr('data-height', $(this).outerHeight() + 'px');
        $(this).css('height', '0px');
    });

    $('.sidebar-menu > li > a').on('click', function(e) {
        var ul = $(this).parent().find('ul');
        if($(ul).length) {
            e.preventDefault();
        }
        if(!$(ul).hasClass('active')) {
            $(ul).css('height', $(ul).attr('data-height'));
            $(ul).addClass('active');
        } else {
            $(ul).css('height', '0px');
            $(ul).removeClass('active');
        }
    });

    /* ======================================================
                            MENU
     =======================================================*/
    $('#toggle-menu').on('click', function() {
        $('.sidebar').toggleClass('small');
        $('.sidebar-menu li ul a').each(function() {

        });
    });

    /* =======================================================
                        PAGINACIÓN
     ========================================================*/
    $('.btn-pag:nth-child(2)').addClass('active');
    $('.btn-pag').on('click', function() {
       $('.btn-pag').each(function() {
          $(this).removeClass('active');
       });
        $(this).addClass('active');
    });

    /* =======================================================
                        FILEUPLOAD
     =======================================================*/
    $('#newForm\\:nfoto').on('change', function() {
        console.log('Se ha puesto foto');
        window.setTimeout(function() {
            //$('#newForm\\:imgFoto').text('');
        }, 1000);
    });
});