# Forcing bluetooth to disabled in /boot/config.txt
do_deploy:append() {
    echo "dtoverlay=disable-bt" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    sed -i 's/dtoverlay=vc4-kms-v3d/dtoverlay=vc4-fkms-v3d/g' ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
