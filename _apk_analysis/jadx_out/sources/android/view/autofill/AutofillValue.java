package android.view.autofill;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class AutofillValue implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ CharSequence getTextValue();

    public native /* synthetic */ boolean isDate();

    public native /* synthetic */ boolean isList();

    public native /* synthetic */ boolean isText();

    public native /* synthetic */ boolean isToggle();
}
