package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f17652c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17653a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17654b = -1;

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        int i10 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr = bVar.f18412a;
            if (i10 >= oVarArr.length) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = oVarArr[i10];
            if (oVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) {
                com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) oVar;
                String str = jVar.f18430c;
                String str2 = jVar.f18431d;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f17652c.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int i11 = Integer.parseInt(matcher.group(1), 16);
                            int i12 = Integer.parseInt(matcher.group(2), 16);
                            if (i11 > 0 || i12 > 0) {
                                this.f17653a = i11;
                                this.f17654b = i12;
                                return;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
    }
}
