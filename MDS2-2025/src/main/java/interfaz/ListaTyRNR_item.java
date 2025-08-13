package interfaz;

import vistas.VistaListadetweetsyretweets_item;

public class ListaTyRNR_item extends VistaListadetweetsyretweets_item 
{
//	public ListaTyRNR _listaTyR;
	public VerRetweetNR _verRNR;
	public VerTweetNR _verTNR;
	
	public ListaTyRNR_item(VerRetweetNR verR, VerTweetNR verT) 
	{
		_verRNR = verR;
		_verTNR = verT;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}