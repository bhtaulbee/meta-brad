
# Turn off screen locking
do_install:append() {
    echo "[core]" >> ${D}${sysconfdir}/xdg/weston/weston.ini
    echo "idle-time=0" >> ${D}${sysconfdir}/xdg/weston/weston.ini
    echo "[shell]" >> ${D}${sysconfdir}/xdg/weston/weston.ini
    echo "locking=false" >> ${D}${sysconfdir}/xdg/weston/weston.ini
}
