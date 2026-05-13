package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f17603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue f17604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17605c;

    public f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f17604b = linkedList;
        this.f17603a = bufferedReader;
    }

    public final boolean a() throws IOException {
        String strTrim;
        if (this.f17605c != null) {
            return true;
        }
        if (!this.f17604b.isEmpty()) {
            this.f17605c = (String) this.f17604b.poll();
            return true;
        }
        do {
            String line = this.f17603a.readLine();
            this.f17605c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f17605c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }
}
