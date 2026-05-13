package na;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;

/* JADX INFO: compiled from: RemindDialog.java */
/* JADX INFO: loaded from: classes12.dex */
public class d extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f75737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f75738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f75739d;

    /* JADX INFO: compiled from: RemindDialog.java */
    public interface a {
        void onClick(View view);
    }

    public d(Context context, String str) {
        super(context, R$style.Picture_Theme_Dialog);
        setContentView(R$layout.ps_remind_dialog);
        TextView textView = (TextView) findViewById(R$id.btnOk);
        this.f75737b = textView;
        TextView textView2 = (TextView) findViewById(R$id.tv_content);
        this.f75738c = textView2;
        textView2.setText(str);
        textView.setOnClickListener(this);
        b();
    }

    public static d a(Context context, String str) {
        return new d(context, str);
    }

    public final void b() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R$style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.btnOk) {
            a aVar = this.f75739d;
            if (aVar != null) {
                aVar.onClick(view);
            } else {
                dismiss();
            }
        }
    }
}
