import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-perspectivabloqueado')
export class VistaPerspectivabloqueado extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout3" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 37%;">
   <vaadin-button id="foto" style="align-self: center; width: 50%; height: 20%; margin: var(--lumo-space-xl);" tabindex="0">
     Foto 
   </vaadin-button>
   <vaadin-text-field id="nombre" style="align-self: center;" type="text" readonly value="Nombre"></vaadin-text-field>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%; height: 40%;"></vaadin-vertical-layout>
   <vaadin-button id="inicio" style="width: 25%; height: 10%; align-self: center;" tabindex="0">
     Inicio 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%;">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 70%; align-self: center; flex-grow: 0;"></vaadin-horizontal-layout>
    <vaadin-button id="desbloquear" style="align-self: center;" tabindex="0">
      Desbloquear 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
