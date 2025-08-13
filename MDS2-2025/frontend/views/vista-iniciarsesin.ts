import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/password-field/src/vaadin-password-field.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/checkbox/src/vaadin-checkbox.js';

@customElement('vista-iniciarsesin')
export class VistaIniciarsesin extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;"></vaadin-vertical-layout>
   <vaadin-button id="imagen" style="align-self: center; width: 50%; height: 20%;" tabindex="0">
     Imagen 
   </vaadin-button>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center;">
    <vaadin-text-field error-message="Please enter a value" required invalid="" label="Usuario" id="usuario" style="align-self: center;" type="text"></vaadin-text-field>
    <vaadin-checkbox id="checkBoxAdmin" style="align-self: center;" type="checkbox" value="on"></vaadin-checkbox>
   </vaadin-horizontal-layout>
   <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" id="password" style="align-self: center;" type="password"></vaadin-password-field>
   <vaadin-button id="iniciar" style="align-self: center;" tabindex="0">
     Iniciar Sesion 
   </vaadin-button>
   <vaadin-button id="cancelar" style="align-self: center;" tabindex="0" dir="cancelar">
     Cancelar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
