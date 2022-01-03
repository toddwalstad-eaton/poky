# FIXME: the LIC_FILES_CHKSUM values have been updated by 'devtool upgrade'.
# The following is the difference between the old and the new license text.
# Please update the LICENSE value if needed, and summarize the changes in
# the commit message via 'License-Update:' tag.
# (example: 'License-Update: copyright years updated.')
#
# The changes:
#
# --- LICENSING
# +++ LICENSING
# @@ -77,53 +77,55 @@
#     test-badsetting.c, test-crypt-badargs.c, test-getrandom-fallbacks.c,
#     test-getrandom-interface.c, test-symbols-compat.sh,
#     test-symbols-renames.sh, test-symbols-static.sh,
# -   build-aux/gen-crypt-h, build-aux/gen-crypt-symbol-vers-h,
# -   build-aux/gen-libcrypt-map, build-aux/skip-if-exec-format-error,
# -   build-aux/zw_alignment.m4, build-aux/zw_static_assert.m4,
# -   build-aux/zw_endianness.m4, build-aux/zw_ld_wrap.m4
# +   build-aux/scripts/gen-crypt-h,
# +   build-aux/scripts/gen-crypt-symbol-vers-h,
# +   build-aux/scripts/gen-libcrypt-map,
# +   build-aux/scripts/skip-if-exec-format-error,
# +   build-aux/m4/zw_alignment.m4, build-aux/m4/zw_static_assert.m4,
# +   build-aux/m4/zw_endianness.m4, build-aux/m4/zw_ld_wrap.m4
#  
#   * Copyright Zack Weinberg and Free Software Foundation, Inc;
#     GPL (v3 or later), with Autoconf exception:
# -   build-aux/zw_automodern.m4, build-aux/zw_simple_warnings.m4
# +   build-aux/m4/zw_automodern.m4, build-aux/m4/zw_simple_warnings.m4
#  
#   * Copyright <vt at altlinux.org>; 0-clause BSD:
#     crypt-yescrypt.c, test-crypt-yescrypt.c
#  
#   * Copyright Kevin Cernekee; FSF All Permissive License:
# -   build-aux/ax_check_vscript.m4
# +   build-aux/m4/ax_check_vscript.m4
#  
#   * Copyright Maarten Bosmans; FSF All Permissive License:
# -   build-aux/ax_append_compile_flags.m4
# +   build-aux/m4/ax_append_compile_flags.m4
#  
#   * Copyright Guido U. Draheim, Maarten Bosmans;
#     FSF All Permissive License:
# -   build-aux/ax_append_flag.m4, build-aux/ax_check_compile_flag.m4
# +   build-aux/m4/ax_append_flag.m4, build-aux/m4/ax_check_compile_flag.m4
#  
#   * Copyright Mike Frysinger; FSF All Permissive License:
# -   build-aux/ax_require_defined.m4
# +   build-aux/m4/ax_require_defined.m4
#  
#   * Copyright Gabriele Svelto; FSF All Permissive License:
# -   build-aux/ax_gcc_func_attribute.m4
# +   build-aux/m4/ax_gcc_func_attribute.m4
#  
#   * Copyright Scott James Remnant, Dan Nicholson;
#     GPL (v2 or later), with Autoconf exception:
# -   build-aux/pkg_installdir_compat.m4
# +   build-aux/m4/pkg_installdir_compat.m4
#  
#   * Copyright Tim Toolan; FSF All Permissive License:
# -   build-aux/ax_compare_version.m4
# +   build-aux/m4/ax_compare_version.m4
#  
#   * Copyright Philip Withnall; FSF All Permissive License:
# -   build-aux/ax_valgrind_check.m4
# +   build-aux/m4/ax_valgrind_check.m4
#  
#   * Copyright Steven G. Johnson, Daniel Richard G.;
#     GPL (v3 or later), with Autoconf exception:
# -   build-aux/ax_pthread.m4
# +   build-aux/m4/ax_pthread.m4
#  
#   * Copyright Francesco Salvestrini; FSF All Permissive License:
# -   build-aux/ax_prog_python_version.m4
# +   build-aux/m4/ax_prog_python_version.m4
#  
#   * Copyright Andrew Collier; FSF All Permissive License:
# -   build-aux/ax_python_module.m4
# +   build-aux/m4/ax_python_module.m4
#  
#   * Copyright holders unknown, no statement of license (all of these
#     files are part of the testsuite and do not contribute to the
# 
#

#
# This provides libcrypto.so.1 which contains obsolete APIs, needed for uninative in particular
#

require libxcrypt.inc

PROVIDES = ""
AUTO_LIBNAME_PKGS = ""
EXCLUDE_FROM_WORLD = "1"

API = "--enable-obsolete-api"

do_install:append () {
	rm -rf ${D}${includedir}
	rm -rf ${D}${libdir}/pkgconfig
	rm -rf ${D}${datadir}
}

