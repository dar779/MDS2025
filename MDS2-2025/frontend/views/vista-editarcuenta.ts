import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/password-field/src/vaadin-password-field.js';

@customElement('vista-editarcuenta')
export class VistaEditarcuenta extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout5" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;"></vaadin-horizontal-layout>
   <vaadin-button id="cambiarFoto" style="align-self: center;" tabindex="0">
     Cambiar Foto Perfil 
   </vaadin-button>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-self: center;"></vaadin-vertical-layout>
   <vaadin-button id="cambiarPassword" style="align-self: center;" tabindex="0">
     Cambiar Contraseña 
   </vaadin-button>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout4" style="align-self: center;"></vaadin-vertical-layout>
   <vaadin-button id="guardar" style="align-self: center;" tabindex="0">
     Guardar Cambios 
   </vaadin-button>
   <vaadin-button id="cancelar" style="align-self: center;" tabindex="0">
     Cancelar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 100%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
