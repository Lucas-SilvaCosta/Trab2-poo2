import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;


// -30 |5
public class PanelTeclas extends JPanel{

	private Teclas[] teclas;
	private Teclado teclado;
	private JButton[] buttons;
    private GridBagConstraints c;
    private GridBagLayout gbl;

    private Color buttonDefaultColor;

    public PanelTeclas(){
    	super();

    	teclado = new Teclado();
    	teclas = teclado.keyboardConstructor();

    	gbl = new GridBagLayout();
		c = new GridBagConstraints();
		setLayout( gbl );

		buttons = new JButton[teclas.length];
		c.fill = GridBagConstraints.BOTH;
    	c.weightx = 1;
    	c.weighty = 0;
    	//System.out.println("nomesTeclas.length: "+nomesTeclas.length);
    	//System.out.println("buttons.length: "+buttons.length+"\n");
    	
    	/*
		for(int i=0; i<teclas.length; i++){
			//System.out.println("i: "+i);
			if(i <= 13){
				
				if(i == 13){
					buttons[i] = new JButton(teclas[i].getNome());
					addComponent(buttons[i], 0, (i*2), 4, 1);
				}else{
					buttons[i] = new JButton(teclas[i].getNome());
					addComponent(buttons[i], 0, (i*2), 2, 1);
				}
				

				//buttons[i] = new JButton(teclas[i].getNome());
				//addComponent(buttons[i], 0, (i*2), 2, 1);
			}
			if(i>13 && i<=27){
				
				int pos = i-15;
				if(i == 14){
					buttons[i] = new JButton(teclas[i].getNome());
					addComponent(buttons[i], 1, 0, 3, 1);
				}else{
					//System.out.println("else");
					buttons[i] = new JButton(teclas[i].getNome());
					addComponent(buttons[i], 1, (pos*2)+3, 2, 1);
					//System.out.println("posMod: "+(pos*2)+3);
				}
				
				//buttons[i] = new JButton(teclas[i].getNome());
				//addComponent(buttons[i], 1, ((i-14)*2), 2, 1);
			}
			if(i>27 && i<=40){
				buttons[i] = new JButton(teclas[i].getNome());
				addComponent(buttons[i], 2, ((i-28)*2), 2, 1);
			}
			if(i>40 && i<=52){
				buttons[i] = new JButton(teclas[i].getNome());
				addComponent(buttons[i], 3, ((i-41)*2), 2, 1);

			}
			if(i>52){
				buttons[i] = new JButton(teclas[i].getNome());
				addComponent(buttons[i], 4, ((i-44)*2), 2, 1);
			}

			
		}
		*/
		for(int i=0; i<teclas.length; i++){
			buttons[i] = new JButton(teclas[i].getNome());
		}

		for(int i=0; i<30; i++){
			
		}

		addComponent(buttons[ 0], 0, 0,  2, 1);
		addComponent(buttons[ 1], 0, 2,  2, 1);
		addComponent(buttons[ 2], 0, 4,  2, 1);
		addComponent(buttons[ 3], 0, 6,  2, 1);
		addComponent(buttons[ 4], 0, 8,  2, 1);
		addComponent(buttons[ 5], 0, 10, 2, 1);
		addComponent(buttons[ 6], 0, 12, 2, 1);
		addComponent(buttons[ 7], 0, 14, 2, 1);
		addComponent(buttons[ 8], 0, 16, 2, 1);
		addComponent(buttons[ 9], 0, 18, 2, 1);
		addComponent(buttons[10], 0, 20, 2, 1);
		addComponent(buttons[11], 0, 22, 2, 1);
		addComponent(buttons[12], 0, 24, 2, 1);
		addComponent(buttons[13], 0, 26, 4, 1);


		addComponent(buttons[14], 1, 0,  3,   1);
		addComponent(buttons[15], 1, 3,  1,   1);
		addComponent(buttons[16], 1, 5,  2,   1);
		addComponent(buttons[17], 1, 7,  2,   1);
		addComponent(buttons[18], 1, 9,  2,  1);
		addComponent(buttons[19], 1, 11, 2, 1);
		addComponent(buttons[20], 1, 13, 2, 1);
		addComponent(buttons[21], 1, 15, 2, 1);
		addComponent(buttons[22], 1, 17, 2, 1);
		addComponent(buttons[23], 1, 19, 2, 1);
		addComponent(buttons[24], 1, 21, 2, 1);
		addComponent(buttons[25], 1, 23, 2, 1);
		addComponent(buttons[26], 1, 25, 2, 1);
		addComponent(buttons[27], 1, 27, 2, 1);
		JLabel blank = new JLabel(" ");
		addComponent(blank      , 1, 29, 1, 1);

		/*
		addComponent(buttons[28], 2, , ,  1);
		addComponent(buttons[29], 2, , ,  1);
		addComponent(buttons[30], 2, , ,  1);
		addComponent(buttons[31], 2, , ,  1);
		addComponent(buttons[32], 2, , ,  1);
		addComponent(buttons[33], 2, , ,  1);
		addComponent(buttons[34], 2, , ,  1);
		addComponent(buttons[35], 2, , ,  1);
		addComponent(buttons[36], 2, , ,  1);
		addComponent(buttons[37], 2, , ,  1);
		addComponent(buttons[38], 2, , ,  1);
		addComponent(buttons[39], 2, , ,  1);
		addComponent(buttons[40], 2, , ,  1);


		addComponent(buttons[41], 3, , ,  1);
		addComponent(buttons[42], 3, , ,  1);
		addComponent(buttons[43], 3, , ,  1);
		addComponent(buttons[44], 3, , ,  1);
		addComponent(buttons[45], 3, , ,  1);
		addComponent(buttons[46], 3, , ,  1);
		addComponent(buttons[47], 3, , ,  1);
		addComponent(buttons[48], 3, , ,  1);
		addComponent(buttons[49], 3, , ,  1);
		addComponent(buttons[50], 3, , ,  1);
		addComponent(buttons[51], 3, , ,  1);
		addComponent(buttons[52], 3, , ,  1);

		addComponent(buttons[53], 4, , ,  1);
		addComponent(buttons[54], 4, , ,  1);
		addComponent(buttons[55], 4, , ,  1);
		addComponent(buttons[56], 4, , ,  1);
		*/
		buttonDefaultColor = buttons[0].getBackground();

    }

    private void addComponent( Component component, int row, int column, int width,
	  int height ){
    	c.gridx = column;
    	c.gridy = row;
    	c.gridwidth = width;
    	c.gridheight = height;
    	//c.insets = new Insets(2, 2, 2, 2);
    	gbl.setConstraints( component, c );
		add( component );
	}

	public void changeBackground(int vk){
		buttons[teclado.getIDbyVk(vk)].setBackground(Color.RED);
	}

	public void changeBack(int vk){
		buttons[teclado.getIDbyVk(vk)].setBackground(buttonDefaultColor);
	}
}