package test;

import java.util.ArrayList;
import javax.swing.JLabel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.ATM;
import main.GUIFrameAbout;

public class TestAbout {
	
	private GUIFrameAbout aboutView;
	
	@Before
	public void init() {
		aboutView = new GUIFrameAbout(new ATM("Shoppinghaus Dresden"));
		
	}
	@Test
	public void testAboutLabels() {
		ArrayList<JLabel> labels = this.aboutView.getLabels();
		
		assertEquals("About IT Solutions Dresden GmbH", labels.get(0).getText());
		assertEquals("IT Solutions Dresden ist eine Firma, die im Bereich der Informationstechnologie tätig ist", labels.get(1).getText());
		assertEquals("Gegründet wurde das Unternehmen im Jahr 2011 und hat seitdem seinen Sitz im Dresdner ", labels.get(2).getText());
		assertEquals("Stadtteil Pieschen im Nordwesten der Stadt. Die Zielgruppe besteht vor allem aus kleinen \r\n", labels.get(3).getText());
		assertEquals("und mittelständigen Unternehmen, die trotz ihres verhältnismäßig geringen Budgets nach ", labels.get(4).getText());
		assertEquals("qualitativ hochwertigen IT-Lösungen suchen. Auch größere Unternehmen, staatliche ", labels.get(5).getText());
		assertEquals("Organisationen und Privatkunden werden gelegentlich betreut.", labels.get(6).getText());
		assertEquals("Anschrift", labels.get(7).getText());
		assertEquals("Kontakt", labels.get(8).getText());
		assertEquals("IT Solutions Dresden GmbH", labels.get(9).getText());
		assertEquals("Leipziger Straße 102a", labels.get(10).getText());
		assertEquals("01127 Dresden", labels.get(11).getText());
		assertEquals("Telefon: 0351 / 336002", labels.get(12).getText());
		assertEquals("Fax: 0351 / 3360029", labels.get(13).getText());
		assertEquals("E-Mail: kontakt@it-dresden.de", labels.get(14).getText());
		assertEquals("", labels.get(15).getText());
	}

}
