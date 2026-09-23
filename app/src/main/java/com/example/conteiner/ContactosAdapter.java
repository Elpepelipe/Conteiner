package com.example.conteiner;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactosAdapter {
    static class ContactosViewFolder extends RecyclerView.ViewHolder {
        final Textview TxtNombre;
        final Textview txtTelefono;
        final Textview txtCorreo;

        ContactosViewFolder (@NonNull View itemView)
        {
            txtNombre = itemView.findViewById(R.id.txt_contacto_nombre);
            txtNombre = itemView.findViewById(R.id.txt_contacto_nombre);
            txtNombre = itemView.findViewById(R.id.txt_contacto_nombre);
        }
    }

}
