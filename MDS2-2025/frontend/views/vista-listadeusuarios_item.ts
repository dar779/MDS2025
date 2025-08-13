import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';

@customElement('vista-listadeusuarios_item')
export class VistaListadeusuarios_item extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout6" style="width: 100%; height: 15%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 15%; align-self: center; height: 70%;">
   <vaadin-button id="foto" style="align-self: center; height: 100%;" tabindex="0">
     Foto 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout3" style="width: 30%; align-self: center;">
   <vaadin-text-field id="nombre" type="text" readonly value="Nombre"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout2"></vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout5" style="align-self: center;">
   <vaadin-text-field id="seguidores" type="text" readonly value="999" style="align-self: center;"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout2"></vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout1" style="align-self: center;">
   <vaadin-button id="seguir" tabindex="0">
     Seguir 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout" style="align-self: center;">
   <vaadin-button id="dejarSeguir" tabindex="0">
     Dejar de seguir 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
