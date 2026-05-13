package com.tbruyelle.rxpermissions2;

import dm.b;
import dm.o;
import dm.q;
import java.util.List;
import xl.k;

/* JADX INFO: loaded from: classes9.dex */
public class Permission {
    public final boolean granted;
    public final String name;
    public final boolean shouldShowRequestPermissionRationale;

    public Permission(String str, boolean z10) {
        this(str, z10, false);
    }

    public Permission(String str, boolean z10, boolean z11) {
        this.name = str;
        this.granted = z10;
        this.shouldShowRequestPermissionRationale = z11;
    }

    public Permission(List<Permission> list) {
        this.name = combineName(list);
        this.granted = combineGranted(list).booleanValue();
        this.shouldShowRequestPermissionRationale = combineShouldShowRequestPermissionRationale(list).booleanValue();
    }

    private Boolean combineGranted(List<Permission> list) {
        return k.fromIterable(list).all(new q<Permission>() { // from class: com.tbruyelle.rxpermissions2.Permission.3
            @Override // dm.q
            public boolean test(Permission permission) throws Exception {
                return permission.granted;
            }
        }).d();
    }

    private String combineName(List<Permission> list) {
        return ((StringBuilder) k.fromIterable(list).map(new o<Permission, String>() { // from class: com.tbruyelle.rxpermissions2.Permission.2
            @Override // dm.o
            public String apply(Permission permission) throws Exception {
                return permission.name;
            }
        }).collectInto(new StringBuilder(), new b<StringBuilder, String>() { // from class: com.tbruyelle.rxpermissions2.Permission.1
            @Override // dm.b
            public void accept(StringBuilder sb2, String str) throws Exception {
                if (sb2.length() == 0) {
                    sb2.append(str);
                } else {
                    sb2.append(", ");
                    sb2.append(str);
                }
            }
        }).d()).toString();
    }

    private Boolean combineShouldShowRequestPermissionRationale(List<Permission> list) {
        return k.fromIterable(list).any(new q<Permission>() { // from class: com.tbruyelle.rxpermissions2.Permission.4
            @Override // dm.q
            public boolean test(Permission permission) throws Exception {
                return permission.shouldShowRequestPermissionRationale;
            }
        }).d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permission permission = (Permission) obj;
        if (this.granted == permission.granted && this.shouldShowRequestPermissionRationale == permission.shouldShowRequestPermissionRationale) {
            return this.name.equals(permission.name);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + (this.granted ? 1 : 0)) * 31) + (this.shouldShowRequestPermissionRationale ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.name + "', granted=" + this.granted + ", shouldShowRequestPermissionRationale=" + this.shouldShowRequestPermissionRationale + '}';
    }
}
