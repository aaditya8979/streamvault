package qp;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.databinding.BindingAdapter;
import pp.b;
import zp.g;

/* JADX INFO: compiled from: ViewAdapter.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: qp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewAdapter.java */
    public class C0939a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f78368b;

        public C0939a(b bVar) {
            this.f78368b = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            b bVar = this.f78368b;
            if (bVar != null) {
                bVar.c(charSequence.toString());
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"textChanged"})
    public static void a(EditText editText, b<String> bVar) {
        editText.addTextChangedListener(new C0939a(bVar));
        g.b("addTextChangedListener >>>>>> ");
    }

    @BindingAdapter(requireAll = false, value = {"requestFocus"})
    public static void b(EditText editText, Boolean bool) {
        if (bool.booleanValue()) {
            editText.setSelection(editText.getText().length());
            editText.requestFocus();
            ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
        }
        editText.setFocusableInTouchMode(bool.booleanValue());
    }
}
