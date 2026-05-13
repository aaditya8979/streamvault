package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC2248Xb implements DialogInterface.OnClickListener {
    public final /* synthetic */ C2030Om A00;

    public DialogInterfaceOnClickListenerC2248Xb(C2030Om c2030Om) {
        this.A00 = c2030Om;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }
}
