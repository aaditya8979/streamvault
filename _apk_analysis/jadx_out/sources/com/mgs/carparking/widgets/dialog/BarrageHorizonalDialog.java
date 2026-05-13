package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.dramarush.shortin.R;
import ed.s;

/* JADX INFO: loaded from: classes7.dex */
public class BarrageHorizonalDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f45172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f45174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f45175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputMethodManager f45176g;

    public class a implements DialogInterface.OnShowListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            BarrageHorizonalDialog.this.f45172c.setFocusableInTouchMode(true);
            BarrageHorizonalDialog.this.f45172c.requestFocus();
            ((InputMethodManager) BarrageHorizonalDialog.this.f45172c.getContext().getSystemService("input_method")).showSoftInput(BarrageHorizonalDialog.this.f45172c, 1);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            BarrageHorizonalDialog.this.f45176g.showSoftInput(view, 2);
            return false;
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BarrageHorizonalDialog.this.f45173d.setText((20 - editable.length()) + "");
            if (editable.length() > 0) {
                BarrageHorizonalDialog.this.f45174e.setEnabled(true);
                BarrageHorizonalDialog.this.f45174e.setTextColor(BarrageHorizonalDialog.this.f45171b.getResources().getColor(R.color.white));
                BarrageHorizonalDialog.this.f45174e.setBackground(BarrageHorizonalDialog.this.f45171b.getResources().getDrawable(R.drawable.shape_video_barrage_submit_green));
            } else {
                BarrageHorizonalDialog.this.f45174e.setEnabled(false);
                BarrageHorizonalDialog.this.f45174e.setTextColor(BarrageHorizonalDialog.this.f45171b.getResources().getColor(R.color.color_999999));
                BarrageHorizonalDialog.this.f45174e.setBackground(BarrageHorizonalDialog.this.f45171b.getResources().getDrawable(R.drawable.bg_video_comment_edit));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public interface d {
        void a(String str);
    }

    public BarrageHorizonalDialog(Context context) {
        super(context, R.style.dialog_center1);
        requestWindowFeature(1);
        this.f45171b = context;
    }

    public final void g(View view) {
        this.f45172c = (EditText) view.findViewById(R.id.et_input);
        this.f45173d = (TextView) view.findViewById(R.id.tv_et_num);
        Button button = (Button) view.findViewById(R.id.bt_submit);
        this.f45174e = button;
        button.setOnClickListener(this);
    }

    public final void h() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(4);
    }

    public void i(d dVar) {
        this.f45175f = dVar;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.bt_submit) {
            return;
        }
        String strTrim = this.f45172c.getText().toString().trim();
        s.c(this.f45172c);
        d dVar = this.f45175f;
        if (dVar != null) {
            dVar.a(strTrim);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f45171b, R.layout.dialog_video_horizonal_barrage, null);
        g(viewGroup);
        setContentView(viewGroup);
        h();
        setOnShowListener(new a());
        this.f45176g = (InputMethodManager) this.f45171b.getSystemService("input_method");
        this.f45172c.setOnTouchListener(new b());
        this.f45172c.addTextChangedListener(new c());
    }
}
