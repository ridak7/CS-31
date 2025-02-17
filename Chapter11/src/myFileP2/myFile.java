package myFileP2;

import java.awt.EventQueue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class myFile {

	private JFrame frame;

	
	// to store current position
    Long currentFrame;
    Clip clip;
      
    // current status of clip
    String status;
      
    AudioInputStream audioInputStream;
    static String filePath = "../Chapter11/src/myFileP2/0002074.wav";
  
    
    
    public myFile() 
			throws UnsupportedAudioFileException,
			IOException, LineUnavailableException 
	{
		
    	
    	
    	// create AudioInputStream object
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
          
        // create clip reference
        clip = AudioSystem.getClip();
          
        // open audioInputStream to the clip
        clip.open(audioInputStream);
          
        //clip.loop(Clip.LOOP_CONTINUOUSLY);
        
        
        initialize();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFile window = new myFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	 public void stop() throws UnsupportedAudioFileException,
	    IOException, LineUnavailableException 
	    {
	        currentFrame = 0L;
	        clip.stop();
	        clip.close();
	    }
	
	
	public void play() 
    {
        //start the clip
        clip.start();
          
        status = "play";
    }
	
	
	public void resetAudioStream() throws UnsupportedAudioFileException, IOException,
    LineUnavailableException 
		{
		audioInputStream = AudioSystem.getAudioInputStream(
				new File(filePath).getAbsoluteFile());
		clip.open(audioInputStream);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		}
	
	
	
	
	
	    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
        
		
		JLabel zzz = new JLabel("A new File named ZZZ.txt has been created,\r\n");
		zzz.setBounds(10, 11, 273, 25);
		frame.getContentPane().add(zzz);
		
		JLabel Keep1 = new JLabel("do you wish to keep this file?");
		Keep1.setBounds(10, 39, 273, 14);
		frame.getContentPane().add(Keep1);
		
		JButton keep = new JButton("keep this file");
		keep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//keep button code
				
				
				
			}
		});
		keep.setBounds(10, 110, 126, 23);
		frame.getContentPane().add(keep);
		
		JButton del = new JButton("delete the file");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//delete button code
				
				
				
			}
		});
		del.setBounds(157, 110, 126, 23);
		frame.getContentPane().add(del);
		
		
		
		
		
		
		JButton nuck = new JButton("Nuclear Button");
		nuck.setBackground(Color.RED);
		nuck.setForeground(Color.BLACK);
		nuck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
				
			      
		
				
				try
		        {
		           
		            clip.loop(Clip.LOOP_CONTINUOUSLY); //starting up the lawnmover of hell 
		          
		        }
		         
		        catch (Exception ex) 
		        {
		            System.out.println("Error with playing sound.");
		            ex.printStackTrace();
		          
		          }
				nuck.setVisible(false);
					
				
				
				
				
				
				JButton stop = new JButton("stop the pain");
				stop.setVisible(true); //setting visablitly to true
				 
				stop.setBackground(Color.CYAN);
				stop.setForeground(Color.BLACK);
				stop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						nuck.setVisible(true);
						stop.setVisible(false);
						
						try
				        {
				            
				            clip.stop();
				          
				        }
				         
				        catch (Exception ex) 
				        {
				            System.out.println("Error with stoping sound.");
				            ex.printStackTrace();
				          
				          }
						
						
						
					}
				});
				stop.setBounds(85, 202, 120, 23);
				frame.getContentPane().add(stop);
				
				
				
				
			
			}});
		nuck.setBounds(85, 202, 120, 23);
		frame.getContentPane().add(nuck);
		
		
		
		
	
		
		
}
}
