import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/password-field/src/vaadin-password-field.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';

@customElement('vista-restablecercontrasea')
export class VistaRestablecercontrasea extends LitElement {
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
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 100%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;"></vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center;"></vaadin-vertical-layout>
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="Usuario" id="usuario" style="align-self: center;" type="text"></vaadin-text-field>
   <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" id="password" style="align-self: center;" type="password"></vaadin-password-field>
   <vaadin-password-field label="Repite Contraseña" placeholder="Enter password" value="secret1" id="repeatPassword" style="align-self: center;" type="password"></vaadin-password-field>
   <vaadin-button id="aceptar" style="align-self: center;" tabindex="0">
     Cambiar Contraseña 
   </vaadin-button>
   <vaadin-button id="cancelar" style="align-self: center;" tabindex="0">
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
