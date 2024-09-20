DESCRIPTION = "deepsleep HAL Implementation."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1e01b26bacfc2232046c90a330332b3"

PROVIDES = "virtual/deepsleep-hal virtual/vendor-deepsleep-hal"
RPROVIDES_${PN} += " virtual/vendor-deepsleepmgr-hal "

SRC_URI = "git://github.com/Mallikarjunm6316/rdkvhal-deepsleep-manager-raspberrypi4.git;branch=develop;protocol=https"

SRCREV = "cda4a256d6caccb5034b02364be74ed3b0c3694e" 

S = "${WORKDIR}/git"

DEPENDS = "iarmbus-headers deepsleep-manager-headers"

inherit autotools coverity

IMAGE_INSTALL += "lib32-deepsleepmgr-hal-raspberrypi4"

CFLAGS += " \
    -I${STAGING_DIR_TARGET}${includedir}/rdk/halif/deepsleep-manager/ \
    "
