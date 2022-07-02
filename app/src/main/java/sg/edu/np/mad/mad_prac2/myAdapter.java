package sg.edu.np.mad.mad_prac2;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewHolder>{
    ArrayList<User> data;
    private OnClickInterface OnClickInterface;

    public myAdapter(ArrayList<User>input,OnClickInterface OnClickInterface){

        data=input;
        this.OnClickInterface=OnClickInterface;
    }
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType){
        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        return new myViewHolder(item,OnClickInterface);
    }
    public void onBindViewHolder(myViewHolder holder, int position){
        User user=data.get(position);
        holder.name.setText(user.getName());
        holder.desc.setText(user.getDescription());
        holder.img.setImageURI(Uri.parse(user.getUri()));
    }

    public int getItemCount(){return data.size();}

}


