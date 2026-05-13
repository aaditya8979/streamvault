package gr;

import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import qr.l;

/* JADX INFO: compiled from: ServiceDescriptorBinder.java */
/* JADX INFO: loaded from: classes11.dex */
public interface c {
    <T extends l> T a(T t10, String str) throws ValidationException, DescriptorBindingException;

    String b(l lVar) throws DescriptorBindingException;
}
