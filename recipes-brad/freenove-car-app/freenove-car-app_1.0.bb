DESCRIPTION = "Custom freenove car app for raspberry pi 4"
AUTHOR = "bhtaulbee@yahoo.com"
LICENSE = "CLOSED"
#PR = "r0"
PV = "0.1+git${SRCPV}"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/bhtaulbee/freenove-car-app.git;protocol=https;branch=main\
          " 
           
S = "${WORKDIR}/git"

DEPENDS += "qtbase qtdeclarative qtdeclarative-native"
RDEPENDS_${PN} += "qtwayland"
#EXTRA_OECMAKE += "-DCMAKE_PREFIX_PATH=${STAGING_DIR_HOST}${prefix}"
EXTRA_OECMAKE = ""


do_install() {
    install -d ${D}/${bindir}
    install -m 0755 appfreenove-car-app ${D}/${bindir}/appfreenove-car-app

    ln -s -r ${D}/${bindir}/appfreenove-car-app ${D}/${bindir}/b2qt
}

inherit qt6-cmake
#inherit populate_sdk_qt6

FILES:${PN} = "${bindir}/appfreenove-car-app \
               ${bindir}/b2qt \
              "
