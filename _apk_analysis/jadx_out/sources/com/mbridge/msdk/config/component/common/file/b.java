package com.mbridge.msdk.config.component.common.file;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: FileDescription.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35872f;

    public String a() {
        return this.f35869c + this.f35867a;
    }

    public void a(String str) {
        this.f35869c = str;
    }

    public void a(boolean z10) {
        this.f35872f = z10;
    }

    public String b() {
        return this.f35868b;
    }

    public void b(String str) {
        this.f35867a = str;
    }

    public String c() {
        return this.f35870d;
    }

    public void c(String str) {
        this.f35868b = str;
    }

    public String d() {
        return this.f35871e;
    }

    public void d(String str) {
        this.f35870d = str;
    }

    public void e(String str) {
        this.f35871e = str;
    }

    public boolean e() {
        return this.f35872f;
    }

    @NonNull
    public String toString() {
        return "FileDescription{fileName='" + this.f35867a + "', fileType='" + this.f35868b + "', dirPath='" + this.f35869c + "', unZipDirPath='" + this.f35870d + "', unZipFilePath='" + this.f35871e + "', fileExists=" + this.f35872f + '}';
    }
}
